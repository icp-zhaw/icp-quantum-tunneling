// Copyright 2002-2011, University of Colorado

/*
 * CVS Info -
 * Filename : $Source$
 * Branch : $Name$
 * Modified by : $Author: samreid $
 * Revision : $Revision: 47760 $
 * Date modified : $Date: 2011-01-07 18:42:54 +0100 (Fr, 07 Jan 2011) $
 */
package edu.colorado.phet.common.phetcommon.view.graphics.transforms;


/**
 * Listens for changes in the model or view viewport.
 *
 * @author ?
 * @version $Revision: 47760 $
 */
public interface TransformListener {
    public void transformChanged( ModelViewTransform2D mvt );
}
