/**
 * 将form的数据转换为json
 *
 * @param formName 表单名字，支持格式：form #form .form
 * @returns {string}
 */
function formToJSON(formName) {
    var data = {};
    var form = $(formName).serializeArray();
    $.each(form, function () {
        data[this.name] = this.value;
    });
    return JSON.stringify(data);
}