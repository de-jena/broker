package de.jena.ttn.sensinact;

public class TtnSubPacket<T> {

    private final String service;
    private final String resource;
    private final String attribute;
    private final String metadata;
    private final T value;

    public TtnSubPacket(String service, String resource, String attribute, String metadata, T value) {
        this.service = service;
        this.resource = resource;
        this.attribute = attribute;
        this.metadata = metadata;
        this.value = value;
    }

    public String getService() {
        return service;
    }

    public String getResource() {
        return resource;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getMetadata() {
        return metadata;
    }

    public T getValue() {
        return value;
    }

}
