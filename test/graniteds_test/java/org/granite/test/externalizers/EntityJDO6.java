/*
  GRANITE DATA SERVICES
  Copyright (C) 2011 GRANITE DATA SERVICES S.A.S.

  This file is part of Granite Data Services.

  Granite Data Services is free software; you can redistribute it and/or modify
  it under the terms of the GNU Library General Public License as published by
  the Free Software Foundation; either version 2 of the License, or (at your
  option) any later version.

  Granite Data Services is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
  for more details.

  You should have received a copy of the GNU Library General Public License
  along with this library; if not, see <http://www.gnu.org/licenses/>.
*/

package org.granite.test.externalizers;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.VersionStrategy;


@PersistenceCapable(detachable="true")
@javax.jdo.annotations.Version(strategy=VersionStrategy.VERSION_NUMBER, column="VERSION",
        extensions={@Extension(vendorName="datanucleus", key="field-name", value="version")})
public class EntityJDO6 {

	@PrimaryKey @Persistent(valueStrategy=IdGeneratorStrategy.NATIVE)
	private Long id;
	
	private Long version;
	
	@Persistent
	private EntityJDO5 entity5;
	
	@Persistent
	private String name;

	public Long getId() {
		return id;
	}

	public Long getVersion() {
		return version;
	}

	public EntityJDO5 getEntity5() {
		return entity5;
	}

	public void setEntity5(EntityJDO5 entity5) {
		this.entity5 = entity5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
