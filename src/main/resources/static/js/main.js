// main.js
document.addEventListener('DOMContentLoaded', function() {
	console.log('Jenkins Example Application loaded!');

	// Add timestamp to footer
	const footer = document.querySelector('footer p');
	const currentYear = new Date().getFullYear();
	footer.innerHTML = `&copy; ${currentYear} Jenkins Example Application`;
});