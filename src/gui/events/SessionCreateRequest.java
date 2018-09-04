package gui.events;

import java.util.Date;

import core.Animal;
import core.Client;
import xyz.baudelaplace.bmvp.framework.events.Event;

public interface SessionCreateRequest extends Event {
	Client getClient();
	Animal getAnimal();
	Date getDate();
}
