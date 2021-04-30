import fetch from 'unfetch';

const checkStatus = response => {
    if (response.ok) {
        return response;
    } else {
        //convert non-2xx Http responses to errors
        const error = new Error(response.statusText);
        error.response = response;
        return Promise.reject(error);
    }
}

export const getAllStudents = () =>
    fetch("http://localhost:8080/api/v1/students")
        .then(checkStatus);
