/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */

package org.eclipse.che.ide.js.api;

import jsinterop.annotations.JsType;

/**
 * Some type that can be dispose, like event listener, some resource, action
 *
 * @author Yevhen Vydolob
 */
@JsType
public interface Disposable {

  /** Dispose this object */
  void dispose();
}
