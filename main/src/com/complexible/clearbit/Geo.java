/*
 * Copyright (c) 2015 Complexible Inc. <http://complexible.com>
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

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * <p></p>
 *
 * @author  Michael Grove
 * @since   0.1
 * @version 0.1
 */
public final class Geo {
	private String mCity;
	private String mState;
	private String mCountry;
	private Double mLat;
	private Double mLong;

	public String getCity() {
		return mCity;
	}

	public void setCity(final String theCity) {
		mCity = theCity;
	}

	public String getCountry() {
		return mCountry;
	}

	public void setCountry(final String theCountry) {
		mCountry = theCountry;
	}

	public Double getLat() {
		return mLat;
	}

	public void setLat(final Double theLat) {
		mLat = theLat;
	}

	public Double getLong() {
		return mLong;
	}

	public void setLong(final Double theLong) {
		mLong = theLong;
	}

	public String getState() {
		return mState;
	}

	public void setState(final String theState) {
		mState = theState;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(mCity, mState, mCountry, mLat, mLong);
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public boolean equals(final Object theObj) {
		if (theObj == this) {
			return true;
		}
		else if (theObj instanceof Geo) {
			Geo aGeo  = (Geo) theObj;
			return Objects.equal(mCity, aGeo.mCity)
				&& Objects.equal(mState, aGeo.mState)
				&& Objects.equal(mCountry, aGeo.mCountry)
				&& Objects.equal(mLat, aGeo.mLat)
				&& Objects.equal(mLong, aGeo.mLong);
		}
		else {
			return false;
		}
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public String toString() {
		return MoreObjects.toStringHelper("Geo")
				   .add("city", mCity)
				   .add("state", mState)
				   .add("country", mCountry)
				   .add("lat", mLat)
				   .add("long", mLong)
				   .toString();
	}
}
