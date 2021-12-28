#!/usr/bin/env ruby
require 'webrick'
require 'logger'
options = {
  :Port => 1234,
  :DocumentRoot => "/usr/share/gitweb",
  :Logger => Logger.new('/home/alphonse/projet_alphonse/project-alphorm.git/gitweb/error.log'),
  :AccessLog => [
    [ Logger.new('/home/alphonse/projet_alphonse/project-alphorm.git/gitweb/access.log'),
      WEBrick::AccessLog::COMBINED_LOG_FORMAT ]
  ],
  :DirectoryIndex => ["gitweb.cgi"],
  :CGIInterpreter => "/home/alphonse/projet_alphonse/project-alphorm.git/gitweb/webrick/wrapper.sh",
  :StartCallback => lambda do
    File.open("/home/alphonse/projet_alphonse/project-alphorm.git/pid", "w") { |f| f.puts Process.pid }
  end,
  :ServerType => WEBrick::Daemon,
}
options[:BindAddress] = '127.0.0.1' if "" == "true"
server = WEBrick::HTTPServer.new(options)
['INT', 'TERM'].each do |signal|
  trap(signal) {server.shutdown}
end
server.start
