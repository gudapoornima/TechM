function getCurrentDayAndTime() {
    const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    
    let now = new Date();
    let day = days[now.getDay()]; // Get the current day
    let hours = now.getHours();
    let minutes = now.getMinutes();
    let seconds = now.getSeconds();
    let meridian = hours >= 12 ? "PM" : "AM";

    // Convert 24-hour format to 12-hour format
    hours = hours % 12 || 12; 

    console.log(`Today is : ${day}.`);
    console.log(`Current time is : ${hours} ${meridian} : ${minutes} : ${seconds}`);
}

getCurrentDayAndTime();
