const events = [
  { name: "Yoga Workshop", date: "2025-05-20", seats: 0 },
  { name: "Art Exhibition", date: "2025-06-10", seats: 25 },
  { name: "Tech Meetup", date: "2025-07-05", seats: 10 }
];

const today = new Date();

events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  }
});

function registerEvent(event) {
  try {
    if (event.seats <= 0) throw new Error("No seats left");
    event.seats--;
    console.log(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } catch (error) {
    console.error(`Registration failed: ${error.message}`);
  }
}
