<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>Ut ad videntur facilisis <em>elit</em> cum. Nibh insitam erat facit
<em>saepius</em> magna. Nam ex liber iriure et imperdiet. Et mirum eros
iis te habent. </p>
<p>Claram claritatem eu amet dignissim magna. Dignissim quam elit facer eros
illum. Et qui ex esse <em>tincidunt</em> anteposuerit. Nulla nam odio ii
vulputate feugait.</p>
<p>In quis <em>laoreet</em> te legunt euismod. Claritatem <em>consuetudium</em>
wisi sit velit facilisi.</p>

<a>jquery.com</a>
<ul>
<li>First item</li>
<li class="selected">Second item</li>
<li>Third item</li>
<li>Fourth item</li>
<li>Fifth item</li>
</ul>
<script type="text/JavaScript"
src="../jquery/1.8.3/jquery-1.8.3.js"></script>
<script type="text/JavaScript">
//alerts total italic words found inside of <p> elements
//alert('The three paragraphs in all contain ' + jQuery('p').find('em').length + 'italic words');

// alerts the jQuery home page URL
//alert(jQuery('a').attr('href','http://www.jquery.com').attr('href'));
alert(jQuery('li.selected').nextAll('li').length);

</script>
</body>
</html>