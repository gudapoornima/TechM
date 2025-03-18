function demo() {
    var x = "var: Function";  
    let y = "let: Block";  
    const z = "const: Immutable";  

    if (true) {
        var a = "variable";
        let b = "let variable";
        console.log(b);
    }

    console.log(x);
    console.log(a);
}
demo();
