package in.datalayer.analytics;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import in.datalayer.model.Session;

public class LogAllSessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent sessionEvent)  {

    	System.out.println("New Session Created ");
    	HttpSession httpSession = sessionEvent.getSession();

    	ServletContext appContext = httpSession.getServletContext();
    	Session session = new Session(
    				httpSession.getId(),
    				httpSession.getCreationTime() );

		List<Session> sessionList =
				(List<Session>) appContext.getAttribute("allSessions");
		if(  sessionList == null ){
			sessionList = new ArrayList<>();
			sessionList.add(session);
		} else {
			sessionList.add(session);
		}

		appContext.setAttribute("allSessions", sessionList);


    }


    public void sessionDestroyed(HttpSessionEvent sessionEvent)  {
    	System.out.println("User Logged Out. Session Destroyed. ");
    	HttpSession httpSession = sessionEvent.getSession();

    	ServletContext appContext = httpSession.getServletContext();
		List<Session> sessionList =
				(List<Session>) appContext.getAttribute("allSessions");
		int sessionIndex=0;
		int index = 0;
		for(Session ses : sessionList) {
			if(ses.getId().equalsIgnoreCase(httpSession.getId())){
				sessionIndex = index;
				break;
			}else {
				index++;
			}
		}
		sessionList.remove(sessionIndex);
		appContext.setAttribute("allSessions", sessionList);
    }

}
