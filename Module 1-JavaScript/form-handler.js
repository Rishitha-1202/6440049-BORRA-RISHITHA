document.getElementById("registrationForm").addEventListener("submit", (e) => {
  e.preventDefault();
  const form = e.target;
  const name = form.elements.name.value.trim();
  const email = form.elements.email.value.trim();
  const selectedEvent = form.elements.event.value;

  const errors = [];
  if (!name) errors.push("Name is required.");
  if (!email) errors.push("Email is required.");
  if (!selectedEvent) errors.push("Please select an event.");

  const errorDiv = document.getElementById("formErrors");
  errorDiv.innerHTML = errors.join("<br>");

  if (errors.length === 0) {
    // Proceed with registration
  }
});
