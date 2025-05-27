// Handle click event on Register button
$('#registerBtn').click(function () {
  alert('You have registered for the event!');
});

// Toggle event cards with fade effect
$('#toggleEvents').click(function () {
  $('.event-card').fadeToggle(500); // fades in if hidden, fades out if visible
});
