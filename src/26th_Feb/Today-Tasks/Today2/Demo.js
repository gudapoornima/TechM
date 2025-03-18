function demo() {
    var x = "var: Function";
    var y = "let: Block";
    var z = "const: Immutable";
    if (true) {
        var a = "variable";
        var b = "let variable";
        console.log(b);
    }
    console.log(x);
    console.log(a);
}
demo();
