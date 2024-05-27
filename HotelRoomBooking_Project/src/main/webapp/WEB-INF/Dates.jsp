<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dates</title>

<Style>
$(document).ready(function() {

    $('#request').hide();
    $('.days').html('Please select a date range of at least the same day. <br/> <i>Max booking: 2 Months.</i>');
    $( "#from" ).datepicker({
      defaultDate: new Date(),
      changeMonth: true,
      numberOfMonths: 1,
      minDate: new Date(),
      maxDate: "+1M",
      beforeShowDay: isAvailable,
      onClose: function( selectedDate ) {
        var day = $("#from").datepicker('getDate');
day.setDate(day.getDate()+1);
        $( "#to" ).datepicker( "option", "txtDate", day );

      }
    });

    $( "#to" ).datepicker({

      defaultDate: new Date(),
      changeMonth: true,
      numberOfMonths: 1,
      minDate: ("#to"),
      maxDate: ("+2M"),
      beforeShowDay: isAvailable,
      onClose: function( selectedDate ) {
        $( "#from" ).datepicker( "option", "txtDatee", selectedDate );
      }
    });

    function isAvailable(date){
    var dateAsString = date.getFullYear().toString() + "-" + (date.getMonth()+1).toString() + "-" + date.getDate();
    var result = $.inArray( dateAsString, bookedDays ) ===-1 ? [true] : [false];
    return result;
  }


    $('#to').on('change',function(){
     var days = (daydiff(parseDate($('#from').val()), parseDate($('#to').val())));
      var cogs = $('#cogsday').html();
      cogs = cogs.replace(/\D/g,'');
      var x = days;
      var y = cogs * x;
      $('.days').html('You have chosen to borrow this item for <b>'+ days + '</b> days at a cost of <b>' + y + '</b> cogs.<br/><br/>');
        if(days){
            if (borrowercogs >= (y)) {
        $('#request').show();
      } else {
           $('#request').hide();
           $('.days').html('You have chosen to borrow this item for <b>'+ days + '</b> days at a cost of <b>' + y + '</b> cogs.<br/><i style=color:red>You do not have enough cogs to borrow for this duration.</i><br/>');
      }
        }

      $('#request').click(function() {

                var cogs = $('#cogsday').html();

                cogs = cogs.replace(/\D/g,'');

        var x = days ;

        var y = cogs * x;
        $('#total').text(y);
        $('#nameID').val(y);
        $('#days').text(days);
        $('#daysID').val(days);

        });
    })

    function parseDate(str) {
    var mdy = str.split('/')
    return new Date(mdy[2], mdy[0]-1, mdy[1]);
}

function daydiff(first, second) {
    return Math.round((second-first)/(1000*60*60*24));
}

  });
  </Style>
</head>
 /* Continue of pg */

 <!-- /* 
var array = ["2015-03-14","2015-03-15","2015-03-16"]
var _selectedDay = "";
var _cascadeDisabled = false;

$('#from').datepicker({
    beforeShowDay: function(date) {
        var _date = jQuery.datepicker.formatDate('yy-mm-dd', date);
        var _isDisabledDate = array.indexOf(_date) != -1;      

        return [ array.indexOf(_date) == -1 ]
    },
    onClose: function(dateStr, event) {
        _selectedDay = dateStr;
    }
});

$('#to').datepicker({
    beforeShowDay: function(date) {
        var _date = jQuery.datepicker.formatDate('yy-mm-dd', date);
        var _isDisabledDate = array.indexOf(_date) != -1;
        if(_selectedDay.length && _isDisabledDate 
          && _selectedDay < _date) {
            _cascadeDisabled = true;
        }

        if(_cascadeDisabled) return false;

        return [ array.indexOf(_date) == -1 ]
    },
    onClose: function(dateStr, event) {
        _cascadeDisabled = false;
    }
});


$("#clear").click(function() {
    $("input[type='text']").val("");
}); */ -->



<body>
<form action="Amount_db.jsp">
<tr><td>From date :</td>
<td> <input type="date" class="textbox" id="txtDate" name="pickup_date" onchange="cal()"></td>
</tr>
<tr>
<td>To date :</td>
<td><input type="date" class="textbox" id="txtDatee" name="dropoff_date" onchange="cal()"/></td>
</tr>
<tr>
<td>Total amount</td>
<td><input type="text" class="textbox" id="numdays2" name="numdays" class="form-control" readonly="readonly"/></td>
</tr>
<input type = "Submit">
</form>
</body>
</html>