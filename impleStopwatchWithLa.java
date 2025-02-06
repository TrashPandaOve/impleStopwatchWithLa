let startTime, laps = [];

function startStopwatch() {
    startTime = new Date();
    laps = [];
    console.log("Stopwatch started.");
}

function recordLap() {
    const lapTime = (new Date() - startTime) / 1000;
    laps.push(lapTime);
    console.log(`Lap ${laps.length}: ${lapTime} seconds`);
}

function stopStopwatch() {
    const totalTime = (new Date() - startTime) / 1000;
    console.log(`Total time: ${totalTime} seconds`);
    console.log("Lap times:", laps);
}

// Example usage:
startStopwatch();
setTimeout(() => recordLap(), 2000);
setTimeout(() => recordLap(), 4000);
setTimeout(() => stopStopwatch(), 6000);
