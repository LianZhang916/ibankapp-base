/*
 * iBankApp
 *
 * License : Apache License,Version 2.0, January 2004
 *
 * See the LICENSE file in English or LICENSE.zh_CN in chinese
 * in the root directory or <http://www.apache.org/licenses/>.
 */

package org.ibankapp.base.util;

public class StringUtil {

    public static boolean isEmpty(String s) {

        return s == null || s.trim().length() == 0;
    }
}
