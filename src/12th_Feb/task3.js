function getCurrentDate() {
    let now = new Date();

    let day = now.getDate();
    let month = now.getMonth() + 1;
    let year = now.getFullYear();

   
    day = day < 10 ? "0" + day : day;
    month = month < 10 ? "0" + month : month;

    console.log(`mm-dd-yyyy: ${month}-${day}-${year}`);
    console.log(`mm/dd/yyyy: ${month}/${day}/${year}`);
    console.log(`dd-mm-yyyy: ${day}-${month}-${year}`);
    console.log(`dd/mm/yyyy: ${day}/${month}/${year}`);
}


getCurrentDate();
