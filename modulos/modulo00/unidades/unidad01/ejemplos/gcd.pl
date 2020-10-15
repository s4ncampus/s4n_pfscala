#!/usr/bin/swipl

:- initialization(main, main).

main(Argv) :-
    process,
    halt.

gcd(X,Y,G) :- X = Y, G = X.
gcd(X,Y,G) :- X < Y, Y1 is Y - X, gcd(X, Y1, G).
gcd(X,Y,G) :- X > Y, gcd(Y, X, G).

process :-
    current_input(Input),
    write("Enter three integer values separated by spaces: "),
    read_string(Input,  " ", " \r\t", _, Number1),
    number_string(Number1_n,Number1),
    read_string(Input,  " ", " \r\t", _, Number2),
    number_string(Number2_n,Number2),
    read_string(Input, "\n", " \r\t", _, Number3),
    number_string(Number3_n,Number3),
    gcd(Number1_n, Number2_n,Tmp),
    gcd(Number3_n, Tmp, Result),
    number_string(Result,ResultStr),
    write("The minimum size to cut is: "),
    write(ResultStr),nl.

