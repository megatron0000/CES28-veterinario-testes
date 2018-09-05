package gui.events;

import core.Session;
import xyz.baudelaplace.bmvp.framework.events.Event;

public interface SessionSaveRequest extends Event {
	Session getSession();
}
