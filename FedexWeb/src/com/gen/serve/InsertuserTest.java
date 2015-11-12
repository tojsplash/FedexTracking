package com.gen.serve;

import static org.mockito.Mockito.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;

public class InsertuserTest extends TestCase {

	public void test_type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertNotNull(Insertuser.class);
	}

	public void test_instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		Insertuser target = new Insertuser();
		assertNotNull(target);
	}

	public void test_doGet_A$HttpServletRequest$HttpServletResponse() throws Exception {
		// TODO auto-generated by JUnit Helper.
		Insertuser target = new Insertuser();
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		target.doGet(request, response);
	}

	public void test_doGet_A$HttpServletRequest$HttpServletResponse_T$ServletException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}

	public void test_doGet_A$HttpServletRequest$HttpServletResponse_T$OException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("abrakadabra");
        when(request.getParameter("emailid")).thenReturn("abra@kadabra.com");
        when(request.getParameter("mobno")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}	
	
	
	
	public void test_doGet_A$HttpServletRequest$HttpServletResponse_T$IOException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("abrakadabra");
        when(request.getParameter("emailid")).thenReturn("abra@kadabra.com");
        when(request.getParameter("mobno")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}

	public void test_doPost_A$HttpServletRequest$HttpServletResponse() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}


	public void test_doPost_A$HttpServletRequest$HttpServletReponse_T$ServltException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("abrakadabra");
        when(request.getParameter("password1")).thenReturn("aaaaaa");
        when(request.getParameter("password2")).thenReturn("aaaa");
        when(request.getParameter("emailid")).thenReturn("aaaa@sss.com");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}
	

	public void test_doPost_A$HttpServletRequest$HttpServltReponse_T$ServltException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("abrakadabra");
        when(request.getParameter("password1")).thenReturn("aaaaaa");
        when(request.getParameter("password2")).thenReturn("aaaaaa");
        when(request.getParameter("emailid")).thenReturn("aaaa@sss.com");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}
	
	
	
	public void test_doPost_A$HttpServletRequest$HttpServletResponse_T$ServletException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("Abra");
        when(request.getParameter("passwd")).thenReturn("Kadabra");
        when(request.getParameter("username")).thenReturn("abrakadabra");
        when(request.getParameter("emailid")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}

	public void test_doPost_A$HttpServletRequest$HttpServletResponse_T$IOException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("fname")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
        Insertuser target = new Insertuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }

    }

}

