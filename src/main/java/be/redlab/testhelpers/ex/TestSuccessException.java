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
package be.redlab.testhelpers.ex;

/**
 * A TestSuccessException. Can be throw in unit tests to indicate that a tests was successful. e.g. with JUnit:
 * 
 * <pre>
 * &#064;Test(expected = TestSuccessException.class)
 * public void mytest() {
 * 	// some test code
 * }
 * </pre>
 * 
 * @author redlab
 * @since 1.0.0
 * 
 */
public class TestSuccessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
