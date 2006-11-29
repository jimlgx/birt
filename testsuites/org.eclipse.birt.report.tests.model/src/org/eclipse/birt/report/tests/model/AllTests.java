/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Actuate Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.birt.report.tests.model;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.birt.report.tests.model.acceptance.AllAcceptanceTests;
import org.eclipse.birt.report.tests.model.api.AllApiTests;
import org.eclipse.birt.report.tests.model.regression.AllRegressionTests;
import org.eclipse.birt.report.tests.model.smoke.AllSmokeTests;

/**
 *
 *  All test cases for tests Model
 */

/**
 * public class AllTests extends utility.BaseTestCase
{

	
	public void test( )
	{
		Test t = AllTests.suite( );
		System.out.println( t );
	}

	public static Test suite( )
	{
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.birt.report.tests.model" ); //$NON-NLS-1$

		List classes = new ArrayList( );
		AllTests allTests = new AllTests( );

		// Add test packages.
		
		classes.addAll( allTests
				.getClasses( "org.eclipse.birt.report.tests.model.api" ) ); //$NON-NLS-1$
		classes
				.addAll( allTests
						.getClasses( "org.eclipse.birt.report.tests.model.regression" ) ); //$NON-NLS-1$ 
		classes.addAll( allTests
				.getClasses( "org.eclipse.birt.report.tests.model.smoke" ) ); //$NON-NLS-1$

		Iterator iter = classes.iterator( );
		while ( iter.hasNext( ) )
		{
			String next = (String) iter.next( );
			if ( next.endsWith( ".AllTests" ) ) //$NON-NLS-1$
				continue;

			try
			{
				Class c = Class.forName( next );
				int modifier = c.getModifiers( );
				if ( Modifier.isPublic( modifier )
						&& !Modifier.isStatic( modifier ) )
				{
					suite.addTestSuite( c );
				}
			}
			catch ( ClassNotFoundException e )
			{
				assert false;
			}
		}

		return suite;
	}
} */

public class AllTests
{
	public static Test suite( )
	{
		TestSuite test = new TestSuite( );
		
		test.addTest( AllRegressionTests.suite( ) );
		test.addTest( AllApiTests.suite( ) );
		test.addTest( AllAcceptanceTests.suite( ) );
		test.addTest( AllSmokeTests.suite( ) );
		
		return test;
	}

}