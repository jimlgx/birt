
/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.data.engine.olap.data.document;

import java.io.IOException;

import org.eclipse.birt.core.archive.RAOutputStream;


/**
 * 
 */

public class RAWriter implements IRandomAccessObject
{
	private RAOutputStream outputStream;
	
	/**
	 * 
	 * @param outputStream
	 */
	RAWriter( RAOutputStream outputStream )
	{
		this.outputStream = outputStream;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#close()
	 */
	public void close( ) throws IOException
	{
		outputStream.close( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#getFilePointer()
	 */
	public long getFilePointer( ) throws IOException
	{
		return outputStream.getOffset( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#length()
	 */
	public long length( ) throws IOException
	{
		throw new UnsupportedOperationException( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#read(byte[], int, int)
	 */
	public int read( byte[] b, int off, int len ) throws IOException
	{
		throw new UnsupportedOperationException( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#read(byte[])
	 */
	public int read( byte[] b ) throws IOException
	{
		throw new UnsupportedOperationException( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#seek(long)
	 */
	public void seek( long pos ) throws IOException
	{
		outputStream.seek( pos );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#setLength(long)
	 */
	public void setLength( long newLength ) throws IOException
	{
		throw new UnsupportedOperationException( );
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.birt.data.engine.olap.data.document.IRandomAccessObject#write(byte[], int, int)
	 */
	public void write( byte[] b, int off, int len ) throws IOException
	{
		outputStream.write( b, off, len );
	}

}
