function addEvent(eventsArray, newEvent) {
  eventsArray.push(newEvent);
}

function registerUser(event) {
  if (event.seats > 0) {
    event.seats--;
    console.log(`User registered for ${event.name}`);
  } else {
    console.log(`No seats available for ${event.name}`);
  }
}

function filterEventsByCategory(eventsArray, category) {
  return eventsArray.filter(event => event.category === category);
}

// Closure to track total registrations per category
function createCategoryTracker() {
  const registrations = {};
  return function (category) {
    registrations[category] = (registrations[category] || 0) + 1;
    console.log(`Total registrations for ${category}: ${registrations[category]}`);
  };
}

const trackRegistration = createCategoryTracker();

// Higher-order function for dynamic search
function searchEvents(eventsArray, predicate) {
  return eventsArray.filter(predicate);
}
