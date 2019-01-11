/* -*- Mode: C++; tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2 -*- */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

gTestfile = 'exception-002.js';

/**
 *  File Name:          exception-002
 *  ECMA Section:
 *  Description:        Tests for JavaScript Standard Exceptions
 *
 *  Construct error.
 *
 *  Author:             christine@netscape.com
 *  Date:               31 August 1998
 */
var SECTION = "exception-002";
var VERSION = "js1_4";
var TITLE   = "Tests for JavaScript Standard Exceptions: ConstructError";

startTest();
writeHeaderToLog( SECTION + " "+ TITLE);

Construct_1();

test();

function Construct_1() {
  result = "failed: no exception thrown";
  exception = null;

  try {
    result = new Math();
  } catch ( e ) {
    result = "passed:  threw exception",
      exception = e.toString();
  } finally {
    new TestCase(
      SECTION,
      "new Math() [ exception is " + exception +" ]",
      "passed:  threw exception",
      result );
  }
}

