dataSource {
	pooled = true
	driverClassName = "org.postgresql.Driver"
        dialect = "org.hibernate.dialect.PostgreSQLDialect"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:postgresql://localhost:5432/rafbermudez_dev?useUnicode=yes&characterEncoding=UTF-8"
		}
		hibernate {   show_sql = true   }
	}
	test {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost/rafbermudez_dev_test?useUnicode=yes&characterEncoding=UTF-8"
		}
	}
	production {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost/rafbermudez_prod?useUnicode=yes&characterEncoding=UTF-8"
			pooled = true
			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			}
		}
	}
}
