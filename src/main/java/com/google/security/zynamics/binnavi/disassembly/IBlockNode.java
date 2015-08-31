/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.disassembly;


import com.google.security.zynamics.zylib.disassembly.ICodeContainer;
import com.google.security.zynamics.zylib.types.graphs.IGraphNode;

/**
 * Interface for basic blocks of functions.
 */
public interface IBlockNode extends IGraphNode<IBlockNode>, ICodeContainer<INaviInstruction> {
  /**
   * Returns the basic block represented by the block node.
   * 
   * @return The basic block represented by the code node.
   */
  INaviBasicBlock getBlock();
}