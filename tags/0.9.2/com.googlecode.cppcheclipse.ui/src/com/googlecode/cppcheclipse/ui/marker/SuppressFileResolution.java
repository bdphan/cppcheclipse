package com.googlecode.cppcheclipse.ui.marker;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

import com.googlecode.cppcheclipse.core.SuppressionProfile;
import com.googlecode.cppcheclipse.ui.Messages;

public class SuppressFileResolution extends SuppressResolution {

	/*
	 * (non-Javadoc)
	 * @see com.googlecode.cppcheclipse.ui.marker.SuppressResolution#getLabel()
	 */
	@Override
	public String getLabel() {
		return Messages.SuppressFileResolution_Label;
	}

	/*
	 * (non-Javadoc)
	 * @see com.googlecode.cppcheclipse.ui.marker.SuppressResolution#suppress(com.googlecode.cppcheclipse.core.SuppressionProfile, org.eclipse.core.resources.IFile, java.lang.String, int)
	 */
	@Override
	protected void suppress(SuppressionProfile profile, IFile file,
			String problemId, int line) throws CoreException {
		new ProblemReporter().deleteMarkers(file);
		profile.addFileSuppression(file);

	}

}