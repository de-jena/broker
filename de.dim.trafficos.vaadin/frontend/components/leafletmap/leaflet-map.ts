import * as L from 'leaflet';
import { html, LitElement, PropertyValues } from 'lit'
import { customElement } from 'lit/decorators.js';
import { nothing } from 'lit-html';

const openStreetMapLayer = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const openStreetMapAttribution = `&copy; <a href='https://www.openstreetmap.org/copyright'>OpenStreetMap</a> contributors`;

@customElement('leaflet-map')
export class LeafletMap extends LitElement {

  private map!: L.Map;
  private marker!: L.Marker;
  
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html`${nothing}`;
  }

  firstUpdated(_changedProperties: PropertyValues) {
    super.firstUpdated(_changedProperties);
    this.map = L.map(this);
    let tileLayer = L.tileLayer(openStreetMapLayer, { attribution: openStreetMapAttribution, maxZoom: 19 });
    tileLayer.addTo(this.map);
    let m = this.map;
    let mark = this.marker;
    
    this.addEventListener("click", function (e: MouseEvent) {
  	const coordinates = m.mouseEventToLatLng(e);
	if(mark) m.removeLayer(mark);
	let icon = L.icon({
    		iconUrl: '../../trafficos/images/location-pin.png',
    		iconSize: [16, 16]
   		});
	mark = L.marker(coordinates, {icon: icon}).addTo(m);
	mark.bindPopup("Lat: " + coordinates.lat + " - Lng: " + coordinates.lng).openPopup();
	m.setView([coordinates.lat, coordinates.lng], m.getZoom());
	});
  }  
  

  async setView(latitude: number, longitude: number, zoomLevel: number) {
    await this.updateComplete; // Make sure map has been initialized
    this.map.setView([latitude, longitude], zoomLevel);
  }
  
  async getCurrentLatitude() {
    await this.updateComplete; // Make sure map has been initialized
    return this.map.getCenter().lat;
  }
  
  async getCurrentLongitude() {
    await this.updateComplete; // Make sure map has been initialized
    return this.map.getCenter().lng;
  }
}


