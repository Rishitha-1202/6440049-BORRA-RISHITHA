function createEvent({ name = "Unnamed Event", date = "TBD", category = "General", seats = 0 }) {
  return { name, date, category, seats };
}

const originalEvents = [...events];
const musicEvents = originalEvents.filter(({ category }) => category === "Music");
