package com.rafbermudez

class Role {

	String authority

	static mapping = {
                table "app_role"
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
