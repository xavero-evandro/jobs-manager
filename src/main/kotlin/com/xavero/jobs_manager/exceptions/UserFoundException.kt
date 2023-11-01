package com.xavero.jobs_manager.exceptions

class UserFoundException : RuntimeException {
    constructor() : super("User already exists")
}