function ToDoList() {
	// Input handler - Keypress (code 13 - Return key)
	$('input').on('keypress', null, this, this.keypressHandler);
	// Plus handler
	$('.fas').on("click", null, this, this.plusHandler);
	// Setup the global handlers
	$('ul').on("click", "li > span", this, this.deleteIt);
	$('ul').on('click', 'li', null, this.completeIt);
}
	
ToDoList.prototype.plusHandler = function(event) {
	$('input').fadeToggle();
	event.stopPropagation();
}

ToDoList.prototype.addToList = function(value) {
	// Create the item
}

ToDoList.prototype.keypressHandler = function(event) {
	console.log($(this));
	if (event.which === 13 && $(this).val().length != 0) {
		event.data.addToList($(this).val());
		$('ul').append(
		'<li class ="listItem"><span><i class="far fa-trash-alt"></i></span>' + 
		$(this).val() + '</li>');
		$(this).val("");
	  	event.stopPropagation(); // Prevent the event from bubbling up the parent chain!
	}
}

ToDoList.prototype.deleteIt = function(event) {
	$(this).parent().addClass('completed');
	$(this).parent().fadeOut(1000, function() {
		$(this).remove();
	});
	event.stopPropagation(); // Prevent the event from bubbling up the parent chain!
}

ToDoList.prototype.completeIt = function(event) {
		event.currentTarget.classList.toggle('completed');
}

var toDoList;

window.onload = function() {
	toDoList = new ToDoList();
}
