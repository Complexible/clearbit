/*
 * Copyright (c) 2015-2016 Complexible Inc. <http://complexible.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.complexible.clearbit;

import java.util.Optional;

/**
 * <p></p>
 *
 * @author  Michael Grove
 * @since   0.2
 * @version 0.2
 */
public interface PersonLookup {

	public PersonLookup email(final String theEmail);
	public PersonLookup firstName(final String theFirstName);
	public PersonLookup lastName(final String theLastName);
	public PersonLookup ip(final String theIP);
	public PersonLookup location(final String theLocation);
	public PersonLookup company(final String theCompany);
	public PersonLookup companyDomain(final String theDomain);
	public PersonLookup twitter(final String theHandle);
	public PersonLookup facebook(final String theURL);
	public PersonLookup linkedIn(final String theURL);

	public Optional<Person> lookup();
}
