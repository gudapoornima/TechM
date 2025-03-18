function daysUntilChristmas() {
    let today = new Date();
    let christmas = new Date(today.getFullYear(), 11, 25); // December 25
    if (today > christmas) {
        christmas.setFullYear(today.getFullYear() + 1);
    }
    let diff = Math.ceil((christmas - today) / (1000 * 60 * 60 * 24));
    console.log(`Days left until Christmas: ${diff}`);
}

daysUntilChristmas();
