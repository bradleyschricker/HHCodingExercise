HHCodingExercise
================

Coding exercise for Hannon Hill

Problem description:

You are given a Secret which encapsulates a function that accepts a single integer parameter and
returns an integer.  In Java or a language of your choice, write an application that determines if
Secret is an additive function secret(x+y) = secret(x) + secret(y) for all prime numbers less than
N where N is a given integer.

Solution:

This solution implements a main activity (HHCodingExerciseActivity) and the Secret class.  The
Secret class has two encapsulated methods, secret1 and secret2, both of which accept a single
integer parameter and return an integer.  Even though the problem description specifies a single
encapsulated method called secret, I made two for testing purposes.  secret1, as a linear function,
is additive and passes the test.  secret2, as an exponential function, is not additive and fails
the test.

HHCodingExerciseActivity contains the method findPrimes, which takes in a single integer parameter
and returns a boolean array.  The parameter defines the size of the array.  Each element of the
array indicates whether that index is prime (true) or not (false).  The activity then tests each
prime up to N with secret1 and secret2.  An Android toast for each test indicating test passage or
failure is displayed to the user.

Prime numbers are determined using the popular Sieve of Eratosthenes algorithm.  Documentation for
this algorithm is readily available in most algorithm texts.  For now, a reasonable explanation is
available here:  http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

This implementation is in the Android flavor of Java.  I chose this for multiple reasons:

    1.) The object-oriented nature of Java made fulfillment of the encapsulation requirement
        exceptionally simple.
    2.) I already had the infrastructure set up on my computer for simple testing on my Android
        phone.
    3.) I am a big fan of the Android Studio IDE, as its shortcuts, auto-complete, and formatting
        features SIGNIFICANTLY cut down on coding time.

Assumptions:

For this exercise, I made the following assumptions:

    1.) Secret was meant to be a class that encapsulated a secret method (function).  Creating an
        instance of Secret would grant access to the method.
    2.) For testing purposes, it would be acceptable to write my own secret method(s).
    3.) For testing purposes, it would be acceptable to write two secret methods.
    4.) Using the Sieve of Eratosthenes algorithm for finding prime numbers less than N would be
        acceptable.
