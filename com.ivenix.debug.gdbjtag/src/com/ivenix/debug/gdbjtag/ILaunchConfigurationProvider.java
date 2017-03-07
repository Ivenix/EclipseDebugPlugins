/*******************************************************************************
 * Copyright (c) 2014 Liviu Ionescu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Liviu Ionescu - initial version
 *******************************************************************************/

package com.ivenix.debug.gdbjtag;

import org.eclipse.debug.core.ILaunchConfiguration;

public interface ILaunchConfigurationProvider {

	// ------------------------------------------------------------------------

	public ILaunchConfiguration getLaunchConfiguration();

	// ------------------------------------------------------------------------
}
