# Public Transport Mock API 

The mock API consists of three separated resources:

+ `GTFSDownloadResource`: responsible for triggering a download of the GTFS data for stops and schedules from the [opendata website](https://www.opendata-oepnv.de) and convert the downloaded data that are then stored in the db;
+ `PTScheduleResource`: responsible for handling queries about static public transport schedules information;
+ `PTUpdateResource`: responsible for handling queries about live updates coming from online public transport vehicles.

## `GTFSDownloadResource`

The `GTFSDownloadResource` consists of three endpoints:

+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/gtfs/download/all`: triggers the download, conversion and saving mechanism for both stops and schedules data. **That is the endpoint to be triggered once the application is first started, in such a way to populate the db. Note that it might take a while to download and convert everything, so, after triggering it, please, wait around 20 minutes before querying another endpoint to check for data.**
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/gtfs/download/stops`: triggers the download, conversion and saving mechanism for the stops data.
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/gtfs/download/schedules`: triggers the download, conversion and saving mechanism for the schedules data.

## `PTScheduleResource`

The `PTScheduleResource` consists of five endpoints:

+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/{day}`: retrieves the schedules for the specified `day`. The `day` path parameter has to be passed in the format `yyyyMMdd` (e.g. `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/20230802` will retrieve all the schedules foreseen for the 2nd of August 2023);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/line/{day}?lines=<line1>&lines=<line2>`: retrieves the schedules for the specified day and the line numbers as specified in the query parameters (e.g. `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/line/20230802?lines=1&lines=2` retrieves the foreseen schedules for the 2nd of August 2023 and running for lines 1 or 2). **Attention: this endpoint currently always return a `NO_CONTENT` response, since there are several attributes that might be associated with the line number and we still need to clarify which one is the correct one to perform the actual query.**
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/time/{day}?start=<start>&end=<end>`: retrieves the schedules for the specified day and the time range as specified in the query parameters. Time has to be provided in the format `HH:mm` and it is expected to be in UTC time zone. (e.g.`https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/time/20230802?start=08:00&end=10:00` retrieves the foreseen schedules for the 2nd of August 2023 and that start and end within 8am and 10am UTC time);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/dhid/{day}?DHID=<dhid1>&DHID=<dhid2>`: retrieves the schedules for the specified day and whose stops contain a stop with at least one of the specified DHID (e.g. `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/dhid/20231010?DHID=de:16053:153145::15314501&DIHID=de:16053:8976` retrieves the schedules foreseen for the 2nd of August 2023 and which have a stop with DHID equals to `de:16053:153145::15314501` and/or `de:16053:8976`);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/stop-name/{day}?stopName=<name1>&stopName=<name2>`: retrieves the schedules for the specified day and whose stops contain a stop with at least one of the specified stop names (e.g.`https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/pts/schedules/stop-name/20230802?stopName=Jena-Ost` retrieves the schedules for the 2nd of August and which have a stop called `Jena-Ost`).

## `PTUpdateResource`

**ATTENTION: for the `PTUpdateResource` we currently implemented two versions of the same endpoint: one returning some fake data and a second one which would return the actual live update from the IBIS-IP.** Once the IBIS-IP is connected, live updates should be stored automatically in the broker `sensinact` database and it should be possible to retrieve them via REST API. 

The `PTUpdateResource`consists of the following endpoints (for the "fake" version of each of them, please, append a `fake` segment to the URL after the `updates` segment):

+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/online`: retrieves the currently online vehicles; the fake data will return a list of 3 devices;
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/trip/{vehicleId}`: retrieves the trip information for the vehicle with the specified id. With the fake data you can specify whatever `vehicleId` you like, and you will get a `TripUpdate` linked to that vehicle id. (e.g. `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/trip/1234` will retrieve a trip update for the vehicle identified as `1234`);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/position/{vehicleId}`: retrieves the latest known position of the vehicle with the specified id. The fake data will always return the same position update;
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/announcement/{vehicleId}`: retrieves the latest announcement update for that `vrehicleId`. The fake endpoint will always return the same fake announcement update;
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/vehicle/{vehicleId}`: retrieves the latest vehicle update for that `vehicleId`. The fake endpoint will always return the same fake update.
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/stop/{vehicleId}`: retrieves the latest stop update for that `vehicleId`. The fake endpoint will always return the same fake update.
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/stop-index/{vehicleId}`: retrieves the latest stop index update for that `vehicleId`. The fake endpoint will always return the same fake update.
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/online`: retrieves the currently online vehicles (with the actual fake data you should get a list of 3 online vehicles);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/trip/{vehicleId}`: retrieves the trip information for the vehicle with the specified id. With the actual fake data you can specify whatever `vehicleId` you like, and you will get a `TripUpdate` linked to that vehicle id. (e.g. `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/trip/1234` will retrieve a trip update for the vehicle identified as `1234`);
+ `https://udp-5g-broker.nomad-dmz.jena.de/sensinact/rest/pt/ptu/updates/position/{vehicleId}`: retrieves the latest known position of the vehicle with the specified id. The actual fake data will always return the same position update.
