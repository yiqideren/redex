/**
 * Copyright (c) 2016-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.redex.test.proguard;

import java.util.List;

public class Alpha {

    private int wombat;
    public int numbat;
    public String omega;
    public List<String> theta;

    public Alpha () {
        wombat = 18;
    }

    public Alpha (int v) {
        wombat = v;
    }

    public int doubleWombat() {
        return 2 * wombat;
    }

   public int doubleWombat(int x) {
       return 2 * wombat * x;
   }

   public int tripleWombat() {
       return 3 * wombat;
   }
}
