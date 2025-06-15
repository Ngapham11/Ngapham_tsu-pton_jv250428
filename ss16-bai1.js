function processConfirm() {
  let result = ``;
  if (confirm(`Hay chon`) === true) {
    result = `Excellent. We'll play a nice game of chess.`;
  } else {
    result = `Maybe later then.`;
  }
  return result;
}
processConfirm(`answer`);
