

function copyTextFunc() {

    alert("Copied the text: ");
    var copyText = document.getElementById("link");


    copyText.select();
    copyText.setSelectionRange(0, 99999);


    navigator.clipboard.writeText(copyText.value);

    alert("Copied the text: " + copyText.value);
}