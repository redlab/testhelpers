/*
 * Copyright 2013 Balder Van Camp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package be.redlab.testhelpers.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
/**
 * An Empty HttpServletResponse. Can be useful to use when mocking classes in tests and a HttpServletResponse is one of
 * the method parameters to be given in a method call. All methods return null when an Object is expected, return
 * false when a boolean is expected and return 0 when a primitive number type is expected as return value.
 * 
 * @author redlab
 * @since 1.0.1
 * 
 */
public class EmptyHttpServletResponse implements HttpServletResponse {

	public void flushBuffer() throws IOException {
	}

	public int getBufferSize() {
		return 0;
	}

	public String getCharacterEncoding() {
		return null;
	}

	public String getContentType() {
		return null;
	}

	public Locale getLocale() {
		return null;
	}

	public ServletOutputStream getOutputStream() throws IOException {
		return null;
	}

	public PrintWriter getWriter() throws IOException {
		return null;
	}

	public boolean isCommitted() {
		return false;
	}

	public void reset() {
	}

	public void resetBuffer() {
	}

	public void setBufferSize(int arg0) {
	}

	public void setCharacterEncoding(String arg0) {
	}

	public void setContentLength(int arg0) {
	}

	public void setContentLengthLong(long arg0) {
	}

	public void setContentType(String arg0) {
	}

	public void setLocale(Locale arg0) {
	}

	public void addCookie(Cookie arg0) {
	}

	public void addDateHeader(String arg0, long arg1) {
	}

	public void addHeader(String arg0, String arg1) {
	}

	public void addIntHeader(String arg0, int arg1) {
	}

	public boolean containsHeader(String arg0) {
		return false;
	}

	public String encodeRedirectURL(String arg0) {
		return null;
	}

	public String encodeRedirectUrl(String arg0) {
		return null;
	}

	public String encodeURL(String arg0) {
		return null;
	}

	public String encodeUrl(String arg0) {
		return null;
	}

	public String getHeader(String arg0) {
		return null;
	}

	public Collection<String> getHeaderNames() {
		return null;
	}

	public Collection<String> getHeaders(String arg0) {
		return null;
	}

	public int getStatus() {
		return 0;
	}

	public void sendError(int arg0) throws IOException {
	}

	public void sendError(int arg0, String arg1) throws IOException {
	}

	public void sendRedirect(String arg0) throws IOException {
	}

	public void setDateHeader(String arg0, long arg1) {
	}

	public void setHeader(String arg0, String arg1) {
	}

	public void setIntHeader(String arg0, int arg1) {
	}

	public void setStatus(int arg0) {
	}

	public void setStatus(int arg0, String arg1) {
	}

}
