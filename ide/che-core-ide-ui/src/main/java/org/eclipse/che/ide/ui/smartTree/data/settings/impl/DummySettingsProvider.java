/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ui.smartTree.data.settings.impl;

import org.eclipse.che.ide.ui.smartTree.data.settings.NodeSettings;
import org.eclipse.che.ide.ui.smartTree.data.settings.SettingsProvider;

/** @author Vlad Zhukovskiy */
public class DummySettingsProvider implements SettingsProvider {
  @Override
  public NodeSettings getSettings() {
    return NodeSettings.DEFAULT_SETTINGS;
  }

  @Override
  public void setSettings(NodeSettings settings) {
    // stub
  }
}
