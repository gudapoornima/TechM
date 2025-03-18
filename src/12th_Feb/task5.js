function rotateStringRight(str) {
    let arr = str.split('');
    setInterval(() => {
        arr.unshift(arr.pop()); 
        console.log(arr.join(''));
    }, 1000);
}

// Call function
rotateStringRight("digiterati");
