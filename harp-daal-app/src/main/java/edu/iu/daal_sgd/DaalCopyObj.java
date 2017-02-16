/*
 * Copyright 2013-2016 Indiana University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.iu.daal_sgd;

public class DaalCopyObj
{

  private double[] data;
  private int index;

  public DaalCopyObj(double[] data, int index) 
  {
    this.data = data;
    this.index = index;
  }

  public double[] getData()
  {
      return this.data;
  }

  public int getIndex()
  {
      return this.index;
  }


}