security {

	// see DefaultSecurityConfig.groovy for all settable/overridable properties

	active = true

	loginUserDomainClass = "User"
	authorityDomainClass = "Role"
	requestMapClass = "Requestmap"
        useRequestMapDomainClass = true
        requestMapPathField="url"
        requestMapConfigAttributeField="configAttribute"
}
