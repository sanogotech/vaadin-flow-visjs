package de.wathoserver.vaadin.visjs.network.event;

import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

import de.wathoserver.vaadin.visjs.network.NetworkDiagram;
import de.wathoserver.vaadin.visjs.network.api.Event;
import elemental.json.JsonException;
import elemental.json.JsonObject;

@SuppressWarnings("serial")
@DomEvent("vaadin-select")
public class SelectEvent extends Event {
  public SelectEvent(final NetworkDiagram source, boolean fromClient,
      @EventData("event.detail") final JsonObject params) throws JsonException {
    super(source, fromClient, params);
  }
}
