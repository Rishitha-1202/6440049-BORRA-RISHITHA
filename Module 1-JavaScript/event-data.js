const eventName = "Community Music Fest";
const eventDate = "2025-06-15";
let availableSeats = 100;

console.log(`Event: ${eventName} on ${eventDate}. Seats: ${availableSeats}`);

function register() {
  if (availableSeats > 0) {
    availableSeats--;
    console.log(`Registered! Remaining seats: ${availableSeats}`);
  } else {
    console.log("No seats available.");
  }
}
