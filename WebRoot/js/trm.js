valDolar=document.getElementById('DolarCO1');
if (valDolar)
	{
	var valCode = 'no';
	if (!valDolar.links)
		{
		valDolar.links = valDolar.getElementsByTagName('a');
		}
	for (var t=0; t<valDolar.links.length; t++)
		{
		var valProv = valDolar.links[t]; if (valProv.href.search('http://dolar.wilkinsonpc.com.co/') != -1)
			{
			if(valProv.getAttribute('rel') == 'nofollow')
				{
				} else {
				valCode='si'; break;
				} 
			} 
		}
	}

if(valDolar&&valCode=='si')
{
while(valDolar.firstChild){valDolar.removeChild(valDolar.firstChild)};
valDolar.style.cssText='background:transparent;background-color:transparent;overflow:hidden;';
marko=document.write('<IFRAME SRC="http://dolar.wilkinsonpc.com.co/dolar-cop-usd-1.html" TITLE="Dolar"></IFRAME>');
marko=document.createElement('font');
marko.id='check';
valDolar.appendChild(marko);
}