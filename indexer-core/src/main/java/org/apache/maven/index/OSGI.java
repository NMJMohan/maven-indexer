package org.apache.maven.index;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * OSGI ontology.
 *
 * @author Olivier Lamy
 * @since 4.1.1
 */
public interface OSGI
{

    /**
     * OSGI namespace
     */
    String OSGI_NAMESPACE = "urn:osgi#";

    Field SYMBOLIC_NAME = new Field( null, OSGI_NAMESPACE, "symbolicName", "Bundle Symbolic Name" );

    Field VERSION = new Field( null, OSGI_NAMESPACE, "version", "Bundle Version" );

    Field EXPORT_PACKAGE = new Field( null, OSGI_NAMESPACE, "exportPackage", "Bundle Export-Package" );

    Field EXPORT_SERVICE = new Field( null, OSGI_NAMESPACE, "exportService", "Bundle Export-Service" );

    Field DESCRIPTION = new Field( null, OSGI_NAMESPACE, "bundleDescription", "Bundle-Description" );

    Field NAME = new Field( null, OSGI_NAMESPACE, "bundleName", "Bundle-Name" );

    Field LICENSE = new Field( null, OSGI_NAMESPACE, "bundleLicense", "Bundle-License" );

    Field DOCURL = new Field( null, OSGI_NAMESPACE, "bundleDocUrl", "Bundle-DocURL" );

    Field IMPORT_PACKAGE = new Field( null, OSGI_NAMESPACE, "importPackage", "Import-Package" );

    Field REQUIRE_BUNDLE  = new Field( null, OSGI_NAMESPACE, "requireBundle", "Require-Bundle" );


}
