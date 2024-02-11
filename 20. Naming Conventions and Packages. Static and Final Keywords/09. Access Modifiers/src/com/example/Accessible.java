package com.example;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. The Accessible interface?
// 2. The int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: Think back to the lecture on interfaces before answering.

interface Accessible {

    int SOME_CONSTANTS = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
